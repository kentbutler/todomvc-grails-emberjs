// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }

grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination
grails.mime.file.extensions = true // enables the parsing of file extensions from URLs into the request format
grails.mime.use.accept.header = false
grails.mime.types = [
    all:           '*/*',
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    xml:           ['text/xml', 'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// What URL patterns should be processed by the resources plugin
grails.resources.adhoc.patterns = ['/images/*', '/css/*', '/js/*', '/plugins/*']

// The default codec used to encode data with ${}
grails.views.default.codec = "none" // none, html, base64
grails.views.gsp.encoding = "UTF-8"
grails.converters.encoding = "UTF-8"
// enable Sitemesh preprocessing of GSP pages
grails.views.gsp.sitemesh.preprocess = true
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

// ----- json-rest-api settings START ----------------------------

// Configure the json-rest-api plugin
//grails.'json-rest-api'.root = "/json"

// Set to 'true' to package JSON objects inside a node named for the object
//   Value of 'false' will use 'data' as the node name instead 
//   Default value is false
//   Enable this for EmberJS
grails.'json-rest-api'.useEntityRootName = true

// Set to 'true' to exclude meta-data from the JSON containing the rendered object
//   Value of 'false' will include meta-data fields such as 'count' and 'status' 
//   Default value is false
//   Enable this for EmberJS
grails.'json-rest-api'.dataFieldsOnly = true


// ----- json-rest-api settings END ----------------------------

environments {
    development {
        grails.logging.jul.usebridge = true
    }
    production {
        grails.logging.jul.usebridge = false
        // TODO: grails.serverURL = "http://www.changeme.com"
    }
    test {
        grails.logging.jul.usebridge = false
    }
}

log4j = {
    appenders {
        rollingFile name:"todo", maxFileSize:"10000KB", maxBackupIndex:10, file:"logs/todo.log",layout:pattern(conversionPattern: '%d{yyyy-MM-dd HH:mm:ss,SSS z} [%t] %-5p[%c]: %m%n')
        console name:'stdout', layout: pattern(conversionPattern: '%d{dd-MM-yyyy HH:mm:ss,SSS} %5p %c{1} - %m%n')
    }

    error  'org.codehaus.groovy.grails.web.servlet',        // controllers
           'org.codehaus.groovy.grails.web.pages',          // GSP
           'org.codehaus.groovy.grails.web.sitemesh',       // layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping',        // URL mapping
           'org.codehaus.groovy.grails.commons',            // core / classloading
           'org.codehaus.groovy.grails.plugins',            // plugins
           'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'
    
    debug 'grails.app','com.gargoylesoftware.htmlunit.WebClient','org.grails.plugins.rest',additivity = true
    warn 'grails.app.services.grails.buildtestdata','BuildTestDataGrailsPlugin','grails.buildtestdata',
          'org.codehaus.groovy','org.grails.plugin','grails.spring','net.sf.ehcache','grails.plugin',
          'org.apache','com.gargoylesoftware.htmlunit','org.codehaus.groovy.grails.orm.hibernate','org.hibernate'
    
    root {
        debug 'stdout', 'todo'
        additivity = true
    }
}
