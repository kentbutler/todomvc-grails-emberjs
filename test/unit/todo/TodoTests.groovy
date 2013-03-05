package todo



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Todo)
class TodoTests {

    void testIsCompleted() {
       Todo todo = new Todo(title:"Test 1", completed:false)
       
       assertTrue !todo.isCompleted()
       assertTrue !todo.completed
    }
}
