package id.cooem.ktx

import androidx.annotation.LayoutRes
import id.cooem.ktx.R.layout.fragment_template_1
import id.cooem.ktx.R.layout.fragment_template_2
import id.cooem.ktx.R.layout.fragment_template_3

enum class TemplateType(@LayoutRes val layout: Int, val photo1: PhotoInfo, val photo2: PhotoInfo, val photo3: PhotoInfo) {

    FIRST(fragment_template_1,
            PhotoInfo(3, 4),
            PhotoInfo(3, 4),
            PhotoInfo(9, 21)),

    SECOND(fragment_template_2,
            PhotoInfo(9, 21),
            PhotoInfo(3, 4),
            PhotoInfo(3, 4)),

    THIRD(fragment_template_3,
            PhotoInfo(3, 4),
            PhotoInfo(3, 4),
            PhotoInfo(16, 9));
}

class PhotoInfo(val aspectRatioX: Int, val aspectRatioY: Int)