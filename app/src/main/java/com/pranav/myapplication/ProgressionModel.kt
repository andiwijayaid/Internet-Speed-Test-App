package com.pranav.myapplication

import java.math.BigDecimal
import java.math.RoundingMode

data class ProgressionModel(var progressTotal: Float = 0f,
                            var progressDownload: Float = 0f,
                            var progressUpload: Float = 0f,
                            var uploadSpeed: BigDecimal = BigDecimal(0),
                            var downloadSpeed: BigDecimal = BigDecimal(0)
)
