package sample.rest.app


import grails.rest.*
import grails.converters.*

class BookstoreController {

    def index() {
        [books: Book.findAll()]
    }

    def otherAction() {
        render(view: '/noFolderView', model: [books: Book.findAll()])
    }

    def otherApproach() {
        [books: Book.findAll()]
    }
}
