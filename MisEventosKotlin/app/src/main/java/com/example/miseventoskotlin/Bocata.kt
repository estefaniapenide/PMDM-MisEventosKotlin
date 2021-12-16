package com.example.miseventoskotlin

object Bocata  {

    var jamon=false
    var queso=false
    var lechuga=false

    override fun toString(): String {
        var bocata:String ="Tu bocata es de "

        if(jamon && queso && lechuga){
            bocata=bocata.plus("jamón, queso y lechuga")
        } else if(jamon){
            bocata=bocata.plus("jamon")
            if(queso){
                bocata=bocata.plus(" y queso.")
            }else if(lechuga){
                bocata=bocata.plus(" y lechuga.")
            }
        }else if(queso){
            bocata=bocata.plus("queso")
            if(lechuga){
                bocata=bocata.plus(" y lechuga.")
            }
        }else if(lechuga){
            bocata=bocata.plus("lechuga")
        }

        return bocata
    }
}