import todo.Todo

class BootStrap {

    def init = { servletContext ->
        
        new Todo(title:"eat",isCompleted:true).save(flush:true)
        new Todo(title:"sleep").save(flush:true)
        new Todo(title:"work").save(flush:true)
        
        println Todo.list()
    }
    def destroy = {
    }
}
