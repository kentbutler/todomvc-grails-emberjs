# ![TodoMVC-Grails-Ember](https://github.com/kentbutler/todomvc-grails-emberjs.git)

### Helping you learn to integrate EmberJS with Grails

This is a sample app which integrates the EmberJS version of Addy Osmani's  TodoMVC collection of Todo apps, with Grails supplying the REST service.

Some minor changes were required to the EmberJS app to integrate to a real REST service.

The Grails app uses the json-rest-api plugin to provide the REST service.  Note that this plugin required a fair amount of modification to update it to the latest version of Grails, 2.1.1., and to speak the dialect of REST that EmberJS expects.

#### Changes that were required to the EmberJS TodoMVC app:

The baseline version of the web portion of this app can be found [in this repository](https://github.com/addyosmani/todomvc).

- modified store.js to use the DS.RESTAdapter and changed the 'url' parameter to match base app URL served at /context/api
- modified the todo model from 'isCompleted' to 'completed'
-- on updates, Ember automatically converts camelcase to underscored - i.e. property 'isCompleted' becomes 'is_completed' on the REST interface


#### Changes to grails-json-rest-api (Living in a Fork)

[See the project for information](https://github.com/kentbutler/grails-json-rest-api)

#### Grails project requirements

This app uses the following plugins for testing:

- [functional-test](http://www.grails.org/plugin/functional-test)


####  Quickstart

* Install [Grails 2.1.1](http://grails.org/) 

* Download this app

        git clone https://github.com/kentbutler/todomvc-grails-emberjs.git

* Download the fork of the `grails-json-rest-api` and check out the EmberJS branch

        git clone https://github.com/kentbutler/grails-json-rest-api.git <my local dir>
        cd <my local dir>
        git checkout emberjs-support

* Place them alongside each other and test the app by opening a console inside the todomvc directory and run:

        grails test-app -functional

    - observe the different JSON output styles of the json-rest-api

* If tests pass then run the app via

        grails run-app

* If they do not pass, ensure the path to the grails-json-rest-api inside of grails-app/conf/BuildConfig.groovy accurately locates the grails-json-rest-api plugin.


#### [Kent Butler](https://github.com/kentbutler) - Developer

[An open source developer](http://kentbutlercs.blogspot.hu/) just trying to make his job easier.


#### License

MIT License
Free to Good Home
