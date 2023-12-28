package com.example.codetuan22.list_fragment

class ItemOfList {
    var title:String? = null
    var description:String? = null
    var image: Int? = null

    constructor(title: String?, description: String?, image:Int?) {
        this.title = title
        this.description = description
        this.image = image
    }
}