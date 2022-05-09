Create Google Maps API at https://console.cloud.google.com/
then paste into string.xml
(以下の日本語)
# RunningApp
* Tên: Ứng dụng chạy 
* HĐH: Android
* Ngôn ngữ: Kotlin
* Chức năng: Sử dụng GG Maps định vị vị trí, tính toán thời gian chạy, khoảng cách chạy, lượng calo tiêu thụ, tốc độ trung bình, ..v.v. Lưu lại quảng được chạy được bằng hình ảnh
* Các thư viện sử dụng: 
 // Material Design
    implementation 'com.google.android.material:material:1.3.0-alpha01'

    // Architectural Components
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"

    // Room
    implementation "androidx.room:room-runtime:2.4.2"
    kapt "androidx.room:room-compiler:2.4.2"
    // Kotlin Extensions and Coroutines support for Room
    implementation "androidx.room:room-ktx:2.2.5"

    // Coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5'

    // Coroutine Lifecycle Scopes
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0"

    // Navigation Components
    implementation "androidx.navigation:navigation-fragment-ktx:2.3.0"
    implementation "androidx.navigation:navigation-ui-ktx:2.3.0"

    // Glide
    implementation 'com.github.bumptech.glide:glide:4.11.0'
    kapt 'com.github.bumptech.glide:compiler:4.11.0'

    // Google Maps Location Services
    implementation 'com.google.android.gms:play-services-location:17.0.0'
    implementation 'com.google.android.gms:play-services-maps:17.0.0'

    // Dagger Core
    implementation "com.google.dagger:dagger:2.28.1"
    kapt "com.google.dagger:dagger-compiler:2.25.2"

    // Dagger Android
    api 'com.google.dagger:dagger-android:2.35.1'
    api 'com.google.dagger:dagger-android-support:2.28.1'
    kapt 'com.google.dagger:dagger-android-processor:2.23.2'

    // Activity KTX for viewModels()
    implementation "androidx.activity:activity-ktx:1.1.0"

    //Dagger - Hilt
    implementation "com.google.dagger:hilt-android:2.28-alpha"
    kapt "com.google.dagger:hilt-android-compiler:2.28-alpha"

    implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha01"
    kapt "androidx.hilt:hilt-compiler:1.0.0-alpha01"

    // Easy Permissions
    implementation 'pub.devrel:easypermissions:3.0.0'

    // Timber
    implementation 'com.jakewharton.timber:timber:4.7.1'

    // MPAndroidChart
    implementation 'com.github.PhilJay:MPAndroidChart:v3.1.0'

    implementation 'android.arch.lifecycle:extensions:1.1.1'
    
* Một số hình ảnh:
![image](https://user-images.githubusercontent.com/75416674/167459479-75b2af88-2320-48da-909f-cdefa2e50c08.png)
![image](https://user-images.githubusercontent.com/75416674/167459651-a5f24ba2-86e4-4324-97d5-7cc70e66e637.png)
![image](https://user-images.githubusercontent.com/75416674/167459689-1fd54877-a5a6-4d7f-9a38-a2cc3e9fe03b.png)
![image](https://user-images.githubusercontent.com/75416674/167459751-47946ba9-4635-471b-bbe2-e766b98b5eba.png)
![image](https://user-images.githubusercontent.com/75416674/167459812-ee1faeef-f25e-4958-9409-38d429db37dd.png)

名前：Notes App
OS：Android
言語：Kotlin
機能：メモの追加、編集、削除。 メモを色で並べ替えます。 メモを色、入力した日付で並べ替える
建築：クリーンな建築
使用されるライブラリ：


