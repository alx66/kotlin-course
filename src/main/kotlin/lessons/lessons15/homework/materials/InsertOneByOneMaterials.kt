package lessons.lessons15.homework.materials

import kotlin.math.max

class InsertOneByOneMaterials : Materials() {

    fun insert(items: List<String>) {
        val materials = extractMaterials()
        val maxIndex = maxOf(items.lastIndex, materials.lastIndex)
        for (i in 0..maxIndex) {
            if (i < items.size) {
                addMaterial(items[i])
            }
            if (i < materials.size) {
                addMaterial(materials[i])
            }
        }
    }
}