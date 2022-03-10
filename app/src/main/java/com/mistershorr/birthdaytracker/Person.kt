package com.mistershorr.birthdaytracker

import java.util.*

data class Person(var name : String = "victor",
                  var birthday : Date = Date(1646932079),
                  var budget : Double = 0.99,
                  var desiredGift : String = "BobTheBuilder",
                  var lastGifts : MutableList<String> = mutableListOf(),
                  var lastGiftsToMe : MutableList<String> = mutableListOf(),
                  var giftPurchased : Boolean = false)
{}