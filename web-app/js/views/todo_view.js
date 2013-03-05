/*global Todos Ember*/
'use strict';

Todos.TodoView = Ember.View.extend({
	tagName: 'li',
	classNameBindings: ['todo.completed:completed', 'isEditing:editing'],

	doubleClick: function () {
		this.set('isEditing', true);
	}
});
