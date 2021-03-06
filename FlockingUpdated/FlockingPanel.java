package Flocking;
import javax.swing.*;

import mvc.*;
import SimStationpac.*;

import java.awt.*;

public class FlockingPanel extends SimStationPanel {

    private JButton startButton;
    private JButton suspendButton;
    private JButton resumeButton;
    private JButton stopButton;
    private JButton statsButton;

    public FlockingPanel(SimStationFactory simStationFactory) {

        super(simStationFactory);
        SimulationView simulationView = new SimulationView(this.model);
        this.setLayout(new GridLayout(1, 2));

        startButton = new JButton("Start");
        suspendButton = new JButton("Suspend");
        resumeButton = new JButton("Resume");
        stopButton = new JButton("Stop");
        statsButton = new JButton("Stats");

        startButton.addActionListener(this);
        suspendButton.addActionListener(this);
        resumeButton.addActionListener(this);
        stopButton.addActionListener(this);
        statsButton.addActionListener(this);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.add(startButton);
        buttonsPanel.add(suspendButton);
        buttonsPanel.add(resumeButton);
        buttonsPanel.add(stopButton);
        buttonsPanel.add(statsButton);
        add(buttonsPanel);
        add(simulationView);
    }

    public static void main(String[] args) {

        SimStationFactory simStationFactory = new FlockingFactory();
        SimStationPanel appPanel = new FlockingPanel(simStationFactory);
        appPanel.display();

    }

}
