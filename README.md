# AutomationTestDemositeTestNG

# Technology:

Tool: selenium

IDE: IntelIJ

Build tool: Gradle

Language: Java

Framework: TestNG

# Prerequisite:

1. Need to install jdk 1.8

2. Need good internet connectivity

# Run the automation script:

1. Open cmd to the project folder

2. Type this command:

        gradle clean test
    
# Selenium will open the browser and start automation.

1.To view report, type this command:

      allure generate allure-results --clean -o allure-report
      allure serve allure-results
