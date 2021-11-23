package com.example.firestoredoc

data class City(val name:String?,
                 val state:String?,
                val country:String?,
                @field:JvmField
                val isCapital:Boolean?= null,
                val population:Long?= null,
                val regions:List<String>?= null
                ) {


                        }