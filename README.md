# LazyAdapter

Lazy Adapter is RecyclerView Adapter which gives you the posibility to do not think about creating and managing adapter.

the only thing you need is to create your own data class and layout.

# Very Important Notice

	Your data class should implement interface called "LazyModel".


	Name of the variable in yout Layout should be "model".

	Make sure you have data binding enabled in your `build.gradle(app)` file:

	`dataBinding {
        enabled = true
    }`

 ### Library is written in API >= 14 in Kotlin.


