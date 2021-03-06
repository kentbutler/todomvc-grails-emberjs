/*global Todos DS*/
'use strict';

Todos.Store = DS.Store.extend({
	revision: 11,
    adapter: DS.RESTAdapter.create({ 
    	bulkCommit: false, 
    	namespace: "todo/api",
    	serializer: Todos.TodoRESTAdapter
    })
});

