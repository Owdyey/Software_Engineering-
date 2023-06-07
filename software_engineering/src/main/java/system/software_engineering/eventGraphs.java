/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system.software_engineering;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author addie
 */
public class eventGraphs extends javax.swing.JDialog{
    public eventGraphs(){
        
        //Create the dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(20, "Sales", "Product 1");
        dataset.addValue(40, "Sales", "Product 2");
        dataset.addValue(30, "Sales", "Product 3");
        dataset.addValue(10, "Sales", "Product 4");
        
        // Create bar chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Product Sales", // Chart title
                "Product", // X-axis label
                "Sales", // Y-axis label
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Plot orientation
                true, // Show legend
                true, // Show tooltips
                false // Show URLs
        );
        
        // Display chart in a frame
        ChartFrame frame = new ChartFrame("Bar Graph", chart);
        frame.pack();
        frame.setVisible(true);
        
    }
}
