package Introduction

/*
* Named and Default arguments*/

fun addNumbers(x: Int, y: Int, z:Int = 0): Int = x+y+z

/*
*  = can be used to return the right hand expression to the function*/

//TODO: Lambdas

/*we can use _ to make number values more readable*
 *any .56 or number consisting of e(exponential form) is by default a double
 * we can specify f to make it a float (3.45f)
 * '0b' to specify that it is binary (0b11010)
 * '0x' for HexaDecimal (0x0FF)
 *
 */

val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010

/*
obj can be checked if they are of particular type by below convention
if (obj is String) {
    print(obj.length)
}
 */

//if y is castable to String then it is returned or else null is returned
val y = "as";
val xx: String? = y as? String

//Raw String is represented in three doubleQuotes
val rawString = """/d{2}"""



fun main(args: Array<String>) {

    //here default value of z will be inherited therefore no needed to oveerride the function
    addNumbers(1,2)

    //we can also specify parameter name for arguments in different order
    addNumbers( y = 2, x= 1)



}
