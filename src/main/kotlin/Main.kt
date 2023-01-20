fun main() {

    val phone = FoldablePhone()

    phone.openPhone()
    phone.checkPhoneScreenLight()
    phone.closePhone()
    phone.checkPhoneScreenLight()
}

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone() : Phone() {

    var isFolded: Boolean = true
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun openPhone(){
        isFolded = false
        switchOn()
    }

    fun closePhone(){
        isFolded = true
        switchOff()
    }
}
