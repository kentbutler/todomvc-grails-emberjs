package todo

import org.apache.commons.logging.LogFactory
import org.grails.plugins.test.GenericRestFunctionalTests

import com.grailsrocks.functionaltest.BrowserTestCase


@Mixin(GenericRestFunctionalTests)
class TodoFunctionalTests extends BrowserTestCase {

	def log = LogFactory.getLog(getClass())
    def messageSource

    void testList() {
        genericTestList(Todo)
    }
    
    void testCreate() {
        genericTestCreate(Todo, [title:"title.one"])
    }
    
    void testShow() {
        genericTestShow(Todo, [title:"title.one"])
    }
    
    void testUpdate() {
        genericTestUpdate(Todo, [title:"title.one"])
    }
    
    void testDelete() {
        genericTestDelete(Todo)
    }
    
}
