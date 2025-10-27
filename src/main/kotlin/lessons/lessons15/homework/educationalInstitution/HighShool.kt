package lessons.lessons15.homework.educationalInstitution

class HighSchool(
    name: String,
    address: String,
    accreditationLevel: String,
    studentGradeLevels: IntRange,
    hasKindergarten: Boolean,
    val hasAdvancedPlacement: Boolean
) : School(name, address, studentGradeLevels, hasKindergarten)