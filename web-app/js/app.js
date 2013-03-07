/*global Ember*/
window.Todos = Ember.Application.create();


window.Todos.TodoRESTAdapter = DS.RESTSerializer.extend({
	  keyForAttributeName: function(type, name) {
	    return name;
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

/*
// This didn't work...probably needs a require()...?
//
// Try to override the default behaviour of the RESTSerializer
DS.RESTSerializer.prototype.keyForAttributeName = function(type, name) {
    //return Ember.String.decamelize(name);
	return name;
};

DS.RESTSerializer.prototype.keyForBelongsTo = function(type, name) {
    var key = this.keyForAttributeName(type, name);

    if (this.embeddedType(type, name)) {
      return key;
    }

    return key + "Id";
};

DS.RESTSerializer.prototype.keyForHasMany = function(type, name) {
    var key = this.keyForAttributeName(type, name);

    if (this.embeddedType(type, name)) {
      return key;
    }

    return this.singularize(key) + "Ids";
};
*/	
