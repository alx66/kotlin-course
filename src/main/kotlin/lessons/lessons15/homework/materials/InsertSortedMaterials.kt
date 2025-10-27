package lessons.lessons15.homework.materials

class InsertSortedMaterials : Materials() {

    fun insert(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach {
            addMaterial(it)
        }
    }
}