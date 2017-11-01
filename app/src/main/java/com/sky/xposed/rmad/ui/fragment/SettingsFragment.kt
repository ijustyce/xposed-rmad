/*
 * Copyright (c) 2017 The sky Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sky.xposed.rmad.ui.fragment

import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import com.sky.xposed.rmad.R

/**
 * Created by sky on 17-11-1.
 */
class SettingsFragment : PreferenceFragment(), Preference.OnPreferenceClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addPreferencesFromResource(R.xml.setting_preferences)
    }

    override fun onPreferenceClick(preference: Preference): Boolean {

        when(preference.key) {
        }
        return true
    }
}