package ksgcollege.HomeWebsite;


import ksgcollege.Utils.Commonutils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.plaf.basic.BasicSliderUI;
import java.util.List;


public class HomePage extends Commonutils {


    @Test(priority = 1)
    public void testHomePage() {

        driver.executeScript("location.reload(true)");
        String pageTitle = driver.getTitle();

        // Expected title
        String expectedTitle = "K.S.G College of Arts and Science | Best Arts & Science College in Coimbatore";
        // Validate if the actual title matches the expected title
        if (pageTitle.equals(expectedTitle)) {
            System.out.println("Page title is as expected: " + pageTitle);
        } else {
            System.out.println("Page title is not as expected. Actual title is: " + pageTitle);
        }
        // Assert using AssertJ
        // Assertions.assertThat(pageTitle).as("Page title validation").isEqualTo(expectedTitle);

    }

    @Test(priority = 2)
    public void testKSGWebSiteContent() {

        // Expected KSG College sections array
        String[] expectedKSGCollegeSectionsArray = {"HOME", "COLLEGE", "GALLERY", "FACILITIES", "CAMPUS",
                "PLACEMENT", "SERVICE", "NIRF", "CONTACT", "ONLINE PAYMENT", "DONATION"};

        int index = 0;
        // Validate the text of each element
        List<WebElement> elements = driver.findElements(By.xpath(CommonXpaths.NAVIGATION_MENU_ITEMS));
        for (WebElement element : elements) {
            // Get the text of each element
            String actualKSGCollegeSectionsText = element.getText();
            // Validate against expected text
            if (index < expectedKSGCollegeSectionsArray.length) {
                String expectedKSGCollegeSectionsText = expectedKSGCollegeSectionsArray[index];
                if (actualKSGCollegeSectionsText.equals(expectedKSGCollegeSectionsText)) {
                    System.out.println("Text for element " + (index + 1) + " is as expected: " + actualKSGCollegeSectionsText);
                } else {
                    System.out.println("Text for element " + (index + 1) + " is not as expected. Actual: " + actualKSGCollegeSectionsText + " | Expected: " + expectedKSGCollegeSectionsText);
                }
            } else {
                System.out.println("No expected text found for element " + (index + 1));
            }
            index++;
        }
    }

    @Test(priority = 3)
    public void testCollegeSubSections() {

        // Replace this with your locator for the element to hover over
        WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a"));
        // Instantiate Actions class
        Actions actions = new Actions(driver);
        // Perform mouse hover action on the element
        actions.moveToElement(elementToHover).perform();
        // Expected KSG College sections array
        String[] expectedKSGCollegeSubSectionsArray = {"ABOUT KSG", "MANAGEMENT", "ACHIEVEMENTS", "COLLEGE COUNCIL", "COLLEGE COMMITTEE",
                "CHARITY", "EVENTS", "VIDEOS"};
        int index = 0;
        // Validate the text of each element
        List<WebElement> elements = driver.findElements(By.xpath(CommonXpaths.COLLEGE_SUB_MENU_ITEMS));
        for (WebElement element : elements) {
            // Get the text of each element
            String actualKSGCollegeSubSectionsText = element.getText();
            // Validate against expected text
            if (index < expectedKSGCollegeSubSectionsArray.length) {
                String expectedKSGCollegeSubSectionsText = expectedKSGCollegeSubSectionsArray[index];
                if (actualKSGCollegeSubSectionsText.equals(expectedKSGCollegeSubSectionsText)) {
                    System.out.println("Text for element " + (index + 1) + " is as expected: " + actualKSGCollegeSubSectionsText);
                } else {
                    System.out.println("Text for element " + (index + 1) + " is not as expected. Actual: " + actualKSGCollegeSubSectionsText + " | Expected: " + expectedKSGCollegeSubSectionsText);
                }
            } else {
                System.out.println("No expected text found for element " + (index + 1));
            }
            index++;
        }
    }

    @Test(priority = 4)
    public void testUGcourse() {
        WebElement elementToHover = driver.findElement(By.xpath(CommonXpaths.COURSES));
        // Instantiate Actions class
        Actions actions = new Actions(driver);
        // Perform mouse hover action on the element
        actions.moveToElement(elementToHover).perform();
        WebElement elementToMoveTo = driver.findElement(By.xpath(CommonXpaths.UG_COURSE));
        actions.moveToElement(elementToMoveTo).perform();
        String[] expectedKSGCollegeSubSectionsArray = {"B.C.A", "B.COM (CA)", "B.COM (PROFESSIONAL ACCOUNTING)", "B.SC COMPUTER SCIENCE", "B.SC INFORMATION TECHNOLOGY",
                "B.COM", "B.SC MULTIMEDIA & WEBTECHNOLOGY", "B.SC BIOTECHNOLOGY", "B.SC CATERING SCIENCE & HOTEL MANAGEMENT", "B.SC ELECTRONICS & COMMUNICATION SYSTEMS",
                "B.SC MATHEMATICS", "B.A ENGLISH LITERATURE", "B.B.A (CA)", "B.SC PSYCHOLOGY"};
        int index = 0;
        // Validate the text of each element
        List<WebElement> elements = driver.findElements(By.xpath(CommonXpaths.COURSE_UG_COURSES_ITEMS));
        for (WebElement element : elements) {
            // Get the text of each element
            String actualKSGCollegeSubSectionsText = element.getText();
            // Validate against expected text
            if (index < expectedKSGCollegeSubSectionsArray.length) {
                String expectedKSGCollegeSubSectionsText = expectedKSGCollegeSubSectionsArray[index];
                if (actualKSGCollegeSubSectionsText.equals(expectedKSGCollegeSubSectionsText)) {
                    System.out.println("Text for element " + (index + 1) + " is as expected: " + actualKSGCollegeSubSectionsText);
                } else {
                    System.out.println("Text for element " + (index + 1) + " is not as expected. Actual: " + actualKSGCollegeSubSectionsText + " | Expected: " + expectedKSGCollegeSubSectionsText);
                }
            } else {
                System.out.println("No expected text found for element " + (index + 1));
            }
            index++;
        }
    }

    @Test(priority = 4)
    public void testPGcourse() {
        WebElement elementToHover = driver.findElement(By.xpath(CommonXpaths.COURSES));
        // Instantiate Actions class
        Actions actions = new Actions(driver);
        // Perform mouse hover action on the element
        actions.moveToElement(elementToHover).perform();
        WebElement elementToMoveTo = driver.findElement(By.xpath(CommonXpaths.PGCOURSE));
        actions.moveToElement(elementToMoveTo).perform();
    }

    @Test(priority = 5)
    public void testGallerypage() {

        WebElement Gallery = driver.findElement(By.xpath(("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")));
        Gallery.click();

// Find the heading element on the gallery page
        WebElement galleryHeading = driver.findElement(By.xpath("//*[@id=\"page-banner\"]/div/div/div/div/h2"));

// Verify if the image is displayed
        if (galleryHeading.isDisplayed()) {
            System.out.println("Gallery Heading  is displayed.");
        } else {
            System.out.println("Gallery Heading is not displayed.");
        }

    }

    @Test(priority = 6)
    public void testFacilitiespage() {

        WebElement Gallery = driver.findElement(By.xpath(("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")));
        Gallery.click();

// Find the FacilitiesBanner on the Facilities page
        WebElement FacilitiesBanner = driver.findElement(By.xpath("//*[@id=\"page-banner\"]"));

// Verify if the Facilities Banner is displayed
        if (FacilitiesBanner.isDisplayed()) {
            System.out.println("Facilities Banner is displayed.");
        } else {
            System.out.println("Facilities Banner is not displayed.");
        }
    }

    @Test(priority = 7)
    public void testCampus() {
        WebElement elementToHover = driver.findElement(By.xpath(CommonXpaths.CAMPUS));
        // Instantiate Actions class
        Actions actions = new Actions(driver);
        // Perform mouse hover action on the element
        actions.moveToElement(elementToHover).perform();
        // Expected KSG College sections array
        String[] expectedKSGCollegeSubSectionsArray = {"CAMPUS", "NSS"};
        int index = 0;
        // Validate the text of each element
        List<WebElement> elements = driver.findElements(By.xpath(CommonXpaths.CAMPUS_SUB_MENU_ITEMS));
        for (WebElement element : elements) {
            // Get the text of each element
            String actualKSGCollegeSubSectionsText = element.getText();
            // Validate against expected text
            if (index < expectedKSGCollegeSubSectionsArray.length) {
                String expectedKSGCollegeSubSectionsText = expectedKSGCollegeSubSectionsArray[index];
                if (actualKSGCollegeSubSectionsText.equals(expectedKSGCollegeSubSectionsText)) {
                    System.out.println("Text for element " + (index + 1) + " is as expected: " + actualKSGCollegeSubSectionsText);
                } else {
                    System.out.println("Text for element " + (index + 1) + " is not as expected. Actual: " + actualKSGCollegeSubSectionsText + " | Expected: " + expectedKSGCollegeSubSectionsText);
                }
            } else {
                System.out.println("No expected text found for element " + (index + 1));
            }
            index++;
        }
    }

    @Test(priority = 8)
    public void testPlacement() {
        WebElement elementToHover = driver.findElement(By.xpath(CommonXpaths.PLACEMENTS_SUB_MENU_ITEMS));
        // Instantiate Actions class
        Actions actions = new Actions(driver);
        // Perform mouse hover action on the element
        actions.moveToElement(elementToHover).perform();
        // Expected KSG College sections array
        String[] expectedKSGCollegeSubSectionsArray = {"PLACEMENT CELL", "PLACEMENT OFFICE", "ACTIVITIES", "COMPANIES", "CAREER"};
        int index = 0;
        // Validate the text of each element
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li"));
        for (WebElement element : elements) {
            // Get the text of each element
            String actualKSGCollegeSubSectionsText = element.getText();
            // Validate against expected text
            if (index < expectedKSGCollegeSubSectionsArray.length) {
                String expectedKSGCollegeSubSectionsText = expectedKSGCollegeSubSectionsArray[index];
                if (actualKSGCollegeSubSectionsText.equals(expectedKSGCollegeSubSectionsText)) {
                    System.out.println("Text for element " + (index + 1) + " is as expected: " + actualKSGCollegeSubSectionsText);
                } else {
                    System.out.println("Text for element " + (index + 1) + " is not as expected. Actual: " + actualKSGCollegeSubSectionsText + " | Expected: " + expectedKSGCollegeSubSectionsText);
                }
            } else {
                System.out.println("No expected text found for element " + (index + 1));
            }
            index++;
        }
    }

    @Test(priority = 8)
    public void testService() {
        WebElement elementToHover = driver.findElement(By.xpath(CommonXpaths.SERVICE));
        // Instantiate Actions class
        Actions actions = new Actions(driver);
        // Perform mouse hover action on the element
        actions.moveToElement(elementToHover).perform();
        // Expected KSG College sections array
        String[] expectedKSGCollegeSubSectionsArray = {"SCHOLARSHIPS", "PROF.SUBBIAH YOGA CENTRE", "GROUP INSURANCE", "RESEARCH PROGRAMME", "UOW"};
        int index = 0;
        // Validate the text of each element
        List<WebElement> elements = driver.findElements(By.xpath(CommonXpaths.SERVICE_SUB_MENU_ITEMS));
        for (WebElement element : elements) {
            // Get the text of each element
            String actualKSGCollegeSubSectionsText = element.getText();
            // Validate against expected text
            if (index < expectedKSGCollegeSubSectionsArray.length) {
                String expectedKSGCollegeSubSectionsText = expectedKSGCollegeSubSectionsArray[index];
                if (actualKSGCollegeSubSectionsText.equals(expectedKSGCollegeSubSectionsText)) {
                    System.out.println("Text for element " + (index + 1) + " is as expected: " + actualKSGCollegeSubSectionsText);
                } else {
                    System.out.println("Text for element " + (index + 1) + " is not as expected. Actual: " + actualKSGCollegeSubSectionsText + " | Expected: " + expectedKSGCollegeSubSectionsText);
                }
            } else {
                System.out.println("No expected text found for element " + (index + 1));
            }
            index++;
        }
    }
}