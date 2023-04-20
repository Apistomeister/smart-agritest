package com.example.smartagritest;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SmartAgricultureClient implements ActionListener {

    // UI components for SensorService methods
    private JTextField temperatureSensorNameTextField, temperatureTextField;
    private JTextField humiditySensorNameTextField, humidityTextField;
    private JTextField lightLevelSensorNameTextField, lightLevelTextField;

    // UI components for LiveStockManagementService methods
    private JTextField livestockNameTextField, livestockTypeTextField, livestockBirthDateTextField, addLivestockResultTextField;

    // UI components for CropManagementService methods
    private JTextField cropNameTextField, cropTypeTextField, cropPlantDateTextField, addCropResultTextField;

    public static void main(String[] args) {
        SmartAgricultureClient gui = new SmartAgricultureClient();
        gui.build();
    }

    private void build() {
        JFrame frame = new JFrame("Smart Agriculture Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(new Insets(15, 15, 15, 15)));

        // Add panels for each method
        panel.add(buildGetTemperaturePanel());
        panel.add(buildGetHumidityPanel());
        panel.add(buildGetLightLevelPanel());
        panel.add(buildAddLivestockPanel());
        panel.add(buildAddCropPanel());

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel buildGetTemperaturePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(new JLabel("Temperature Sensor Name:"));
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        temperatureSensorNameTextField = new JTextField("", 10);
        panel.add(temperatureSensorNameTextField);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        JButton button = new JButton("Get Temperature");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        temperatureTextField = new JTextField("", 10);
        temperatureTextField.setEditable(false);
        panel.add(temperatureTextField);

        return panel;
    }

    private JPanel buildGetHumidityPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(new JLabel("Humidity Sensor Name:"));
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        humiditySensorNameTextField = new JTextField("", 10);
        panel.add(humiditySensorNameTextField);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        JButton button = new JButton("Get Humidity");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        humidityTextField = new JTextField("", 10);
        humidityTextField.setEditable(false);
        panel.add(humidityTextField);

        return panel;
    }

    private JPanel buildGetLightLevelPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(new JLabel("Light Level Sensor Name:"));
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        lightLevelSensorNameTextField= new JTextField("", 10);
        panel.add(lightLevelSensorNameTextField);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        JButton button = new JButton("Get Light Level");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        lightLevelTextField = new JTextField("", 10);
        lightLevelTextField.setEditable(false);
        panel.add(lightLevelTextField);

        return panel;
    }
    private JPanel buildAddLivestockPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(new JLabel("Name:"));
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        livestockNameTextField = new JTextField("", 10);
        panel.add(livestockNameTextField);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        panel.add(new JLabel("Type:"));
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        livestockTypeTextField = new JTextField("", 10);
        panel.add(livestockTypeTextField);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        panel.add(new JLabel("Birth Date:"));
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        livestockBirthDateTextField = new JTextField("", 10);
        panel.add(livestockBirthDateTextField);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        JButton button = new JButton("Add Livestock");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        addLivestockResultTextField = new JTextField("", 10);
        addLivestockResultTextField.setEditable(false);
        panel.add(addLivestockResultTextField);

        return panel;
    }

    private JPanel buildAddCropPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(new JLabel("Name:"));
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        cropNameTextField = new JTextField("", 10);
        panel.add(cropNameTextField);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        panel.add(new JLabel("Type:"));
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        cropTypeTextField = new JTextField("", 10);
        panel.add(cropTypeTextField);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        panel.add(new JLabel("Plant Date:"));
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        cropPlantDateTextField = new JTextField("", 10);
        panel.add(cropPlantDateTextField);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        JButton button = new JButton("Add Crop");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        addCropResultTextField = new JTextField("", 10);
        addCropResultTextField.setEditable(false);
        panel.add(addCropResultTextField);

        return panel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String label = button.getActionCommand();

        if (label.equals("Get Temperature")) {
            String sensorName = temperatureSensorNameTextField.getText();
            getTemperature(sensorName);
        } else if (label.equals("Get Humidity")) {
            String sensorName = humiditySensorNameTextField.getText();
            getHumidity(sensorName);
        } else if (label.equals("Get Light Level")) {
        	String sensorName = lightLevelSensorNameTextField.getText();
        	getLightLevel(sensorName);
        	} else if (label.equals("Add Livestock")) {
        	String name = livestockNameTextField.getText();
        	String type = livestockTypeTextField.getText();
        	String birthDate = livestockBirthDateTextField.getText();
        	addLivestock(name, type, birthDate);
        	} else if (label.equals("Add Crop")) {
        	String name = cropNameTextField.getText();
        	String type = cropTypeTextField.getText();
        	String plantDate = cropPlantDateTextField.getText();
        	addCrop(name, type, plantDate);
        	}
        	}
 // Replace these placeholders with the actual implementation of the client methods
    private void getTemperature(String sensorName) {
        // ...
        double temperature = 25.0; // Replace with actual value from the service
        temperatureTextField.setText(String.format("%.2f", temperature));
    }

    private void getHumidity(String sensorName) {
        // ...
        double humidity = 60.0; // Replace with actual value from the service
        humidityTextField.setText(String.format("%.2f", humidity));
    }

    private void getLightLevel(String sensorName) {
        // ...
        double lightLevel = 1000.0; // Replace with actual value from the service
        lightLevelTextField.setText(String.format("%.2f", lightLevel));
    }

    private void addLivestock(String name, String type, String birthDate) {
        // ...
        boolean success = true; // Replace with actual result from the service
        addLivestockResultTextField.setText(success ? "Success" : "Failure");
    }

    private void addCrop(String name, String type, String plantDate) {
        // ...
        boolean success = true; // Replace with actual result from the service
        addCropResultTextField.setText(success ? "Success" : "Failure");
    }
}