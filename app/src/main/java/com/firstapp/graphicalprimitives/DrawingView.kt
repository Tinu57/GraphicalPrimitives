import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class DrawingView(context: Context) : View(context) {
    private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Clear canvas
        canvas.drawColor(Color.WHITE)

        // Draw a circle
        paint.color = Color.RED
        canvas.drawCircle(200f, 200f, 100f, paint)

//        // Draw an ellipse
//        paint.color = Color.BLUE
//        canvas.drawOval(100f, 400f, 400f, 600f, paint)

        // Draw a rectangle
        paint.color = Color.GREEN
        canvas.drawRect(100f, 700f, 400f, 900f, paint)

        // Draw text
        paint.color = Color.BLACK
        paint.textSize = 50f
        canvas.drawText("Hello, Android!", 100f, 1100f, paint)
    }
}
