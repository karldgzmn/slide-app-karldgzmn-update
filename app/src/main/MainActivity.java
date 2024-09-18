package edu.byuh.cis300.gridassignment1;

import static android.graphics.Color.BLACK;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class MainActivity extends View {

    private Paint paintLine;

    // Constructor that initializes the view and sets up the Paint object
    public MainActivity(Context context) {
        super(context);
        paintLine = new Paint();
        paintLine.setColor(BLACK); // Black color for the lines (hex color code)
    }

    // The onDraw method is where the actual drawing of the game board happens
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Get the screen dimensions (width and height in pixels)
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        float screenWidth = metrics.widthPixels;
        float screenHeight = metrics.heightPixels;

        // Determine the size of the grid: 90% of the smaller of the two dimensions
        // This keeps the grid square and centered, regardless of orientation (portrait/landscape)
        float gridSize = Math.min(screenWidth, screenHeight) * 0.9f;

        // Calculate the size of each cell (since the grid is 5x5, divide by 5)
        float cellSize = gridSize / 5;

        // Calculate the starting X and Y coordinates so that the grid is centered on the screen
        float startX = (screenWidth - gridSize) / 2;
        float startY = (screenHeight - gridSize) / 2;

        // Set the line thickness relative to the screen size (2% of the grid size)
        paintLine.setStrokeWidth(gridSize * 0.02f);

        // Draw the 5x5 grid using a loop
        // Loop goes from 0 to 5 to cover both lines on the borders and the inner lines
        for (int i = 0; i <= 5; i++) {
            // This draw horizontal lines across the grid
            // Each line starts at (startX, startY + i * cellSize) and ends at (startX + gridSize, startY + i * cellSize)
            canvas.drawLine(startX, startY + i * cellSize, startX + gridSize, startY + i * cellSize, paintLine);

            // this raw vertical lines across the grid
            // Each line starts at (startX + i * cellSize, startY) and ends at (startX + i * cellSize, startY + gridSize)
            canvas.drawLine(startX + i * cellSize, startY, startX + i * cellSize, startY + gridSize, paintLine);
        }
    }
}
