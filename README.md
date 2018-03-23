# LazyAdapter

Lazy Adapter is RecyclerView adapter which gives you the posibility to do not care about creating and managing adapter.

The only thing you need is to create your own data class and layout.

# Very Important Notice

	Your data class should implement interface called "LazyModel".


	Name of the variable in yout Layout should be "model".

	Make sure you have data binding enabled in your `build.gradle(app)` file:

	`dataBinding {
        enabled = true
    }`

This is just the first version of it and many changes should and will be done. The code is not clean and pretty looking.

You can find a sample in app folder MainActivity.
 ### Library is written in API >= 14 in Kotlin.


