/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// Synchronized library configuration for all modules
// This "componentsVersion" number is defined in ".buildconfig.yml" and should follow
// semantic versioning (MAJOR.MINOR.PATCH). See https://semver.org/
class Config(val componentsVersion: String) {
    companion object {
        // Maven group ID used for all components
        const val componentsGroupId = "org.mozilla.components"

        // Synchronized build configuration for all modules
        const val compileSdkVersion = 29
        const val minSdkVersion = 21
        const val targetSdkVersion = 28
    }
}
