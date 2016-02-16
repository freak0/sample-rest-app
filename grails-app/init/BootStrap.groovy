import sample.rest.app.Book

class BootStrap {

    def init = { servletContext ->
        def book = new Book(name: 'The Book on books', author: 'Author, The', launchDate: new Date()).
                save(failOnError: true)
    }

    def destroy = {
    }
}
