package sample.rest.app


import grails.rest.*
import grails.converters.*

class BookstoreController {

    def index() {
        [books: Book.findAll()]
    }
}
