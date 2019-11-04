package skate.bogota.webservicegoskate.AuthService

import com.example.webservicegoskate.ServicePost
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

object GoSkateRest {

    private var retrofit: Retrofit? = null
    private const val BASE_URL = "http://skate.ruidoculto.com/"
    private var AUTH = "Basic"


    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val original = chain.request()

            val requestBuilder = original.newBuilder()
                .addHeader("Autorizacion", AUTH)
                .method(original.method(), original.body())

            val request = requestBuilder.build()
            chain.proceed(request)
        }.build()

    val instance: ServicePost by lazy {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
        }
        retrofit!!.create(ServicePost::class.java)
    }
}