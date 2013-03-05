# ![TodoMVC-Grails-Ember](https://github.com/kentbutler/todomvc-grails-emberjs.git)

## Helping you learn EmberJS with Grails

This is a sample app which integrates the EmberJS version of Addy Osmani's  TodoMVC collection of Todo apps, with Grails supplying the REST service.

Some minor changes were required to the EmberJS app to integrate to a real REST service.

The Grails app uses the json-rest-api plugin to provide the REST service.  Note that this plugin required a fair amount of modification to update it to the latest version of Grails, 2.1.1., and to speak the dialect of REST that EmberJS expects.

#### Changes that were required to the EmberJS TodoMVC app:

The baseline version of the web portion of this app can be found [in this repository here](https://github.com/addyosmani/todomvc).

- modified store.js to use the DS.RESTAdapter and changed the 'url' parameter to match base app URL served at /context/api
- modiied the todo model from 'isCompleted' to 'completed'
-- on updates, Ember automatically converts camelcase to underscored - i.e. property 'isCompleted' becomes 'is_completed' on the REST interface


###### Changes to json-rest-api

- [See the project](https://github.com/padcom/grails-json-rest-api)
- Note if it's not there yet the pull is still pending

###### Grails project requirements

This app uses the following plugins for testing:

- [build-test-data](http://grails.org/plugin/build-test-data)
- [functional-test](http://www.grails.org/plugin/functional-test)


###### Looking Around

To suss out the app do the following:

- Install [Grails 2.1.1](http://grails.org/) 
- Execute the functional tests:   grails test-app
--  and observe the different JSON output styles of the json-rest-api
- Execute the webapp:  grails run-app


#### [Kent Butler](https://github.com/kentbutler) - Developer

[An open source developer](http://kentbutlercs.blogspot.hu/) just trying to make his job easier.


## License

MIT License
Free to Good Home