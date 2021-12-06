package hn.edu.ujcv.pdm_2021_iii_p3_investigacion

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}