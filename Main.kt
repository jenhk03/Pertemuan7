fun main()
{
    var name = "Jen"
    var age = 22
    var occupation = ""

    var errorCode: Int?
    errorCode = 100
    println(errorCode)
    errorCode = null
    println(errorCode)

    var result: Int? = 30
    println(result)

    println(result!! + 1)

    var authorName: String? = "Jen"
    var authorAge: Int? = 22
    val ageAfterBirthday = authorAge!! + 1
    println("After their next birthday, author will be $ageAfterBirthday")
    println("After two birthday, author will be ${authorAge + 2}")

//    Smart Casts
    var nonNullableAuthor: String
    var nullableAuthor: String?

    if (authorName != null)
    {
        nonNullableAuthor = authorName
    }
    else
    {
        nullableAuthor = authorName
    }

//    Safe call
    authorName = "Jendraja"
    var nameLength = authorName?.length
    println("Author's name has length $nameLength.")

    var nameLengthPlus5 = authorName?.length?.plus(5)
    println("Author's name length + 5 is $nameLengthPlus5.")

//    Let function
    authorName?.let { nonNullableAuthor = authorName }
    authorName?.let { nameLength = authorName.length }

//    Elvis
    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0
    println(mustHaveResult)

    nullableInt = null
    mustHaveResult = nullableInt ?: 0
    println(mustHaveResult)
}