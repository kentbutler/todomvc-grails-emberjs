/*global Ember*/
window.Todos = Ember.Application.create();

// Override the default behaviour of the RESTSerializer to not convert
//   my camelized field names into underscored versions
Todos.TodoRESTAdapter = DS.RESTSerializer.extend({
	  keyForAttributeName: function(type, name) {
	    return name;
	    //return Ember.String.decamelize(name);  // this is the default behaviour
	  },

	  keyForBelongsTo: function(type, name) {
	    var key = this.keyForAttributeName(type, name);

	    if (this.embeddedType(type, name)) {
	      return key;
	    }

	    return key + "Id";
	  },

	  keyForHasMany: function(type, name) {
	    var key = this.keyForAttributeName(type, name);

	    if (this.embeddedType(type, name)) {
	      return key;
	    }

	    return this.singularize(key) + "Ids";
	  }
});

