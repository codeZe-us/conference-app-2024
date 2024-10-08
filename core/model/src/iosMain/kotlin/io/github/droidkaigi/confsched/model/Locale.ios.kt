package io.github.droidkaigi.confsched.model

import platform.Foundation.NSLocale
import platform.Foundation.preferredLanguages

public actual fun getDefaultLocale(): Locale =
    if (NSLocale.preferredLanguages.first().toString().startsWith("ja")) {
        Locale.JAPAN
    } else {
        Locale.OTHER
    }
