package lessons.lessons15.homework.educationalInstitution

open class School(
    name: String,
    address: String,
    val studentGradeLevels: IntRange,
    val hasKindergarten: Boolean
) : EducationalInstitution(name, address)