# SELENIUM WEBDRIVER 3 ARCHITECTURE:
Selenium Scrrpt (Client) --> JSON Wire Protocol --> Browser Servers (.exe files) --> Browser Response

# SELENIUM WEBDRIVER 4 ARCHITECTURE:
Selenium Scrrpt (Client) --> W3C Webdriver Protocol --> Browser Servers (.exe files) --> Browser Response. No JSON wire protocol needed.

# SELENIUM 4.6.0 OR HIGHER UPDATE
1. In previous selenium versions, users have to include path to the browser .exe file in order to invoke the browser.
2. This made it cumbersome to constantly update the .exe file as browsers got updated to new versions.
3. To avoid this, Selenium now has a Selenium Manager package that recognizes the browser version installed and uses the appropriate .exe file. It is optional for the user to include the .exe file path in the code.
4. ***If the user provides the .exe file in the code, Selenium Manager gets turned off and the browser version provided is used.***

# SELENIUM TUTORIAL:
#### SELENIUM INTRO:
1. Selenium scripts are written in Java class files.
2. Each browser has its own driver class that has the methods to automate browser functionality. Ex: ChromeDriver()
3. We create an object of the browser driver so that the methods can be accessed.
4. Syntax: ***classname objectname = new classname();***
5. There is an interface called ***WebDriver*** that has all the method names (abstract methods - only names, no bodies) which are used by all browser driver classes.
6. It is the responsibility of the browser driver classes to implement the methods within their class. Thse browser driver classes can also implement their own methods that would be specific to their own class.
7. Therefore, it is recommended to create an object of the interface rather than the browser driver class so all the methods used are generic and the code can be applied to any browser. ***Ex: Webdriver driver = new EdgeDriver(); INSTEAD OF EdgeDriver driver = new EdgeDriveer();***

#### SELENIUM LOCATORS:
1. The Locators are the 2ay to identify an HTML element on a web page. Selenium WebDriver uses any of the below locators to identify the element on the page and performs the action:
   -- ID
   -- Name
   -- Class Name
   -- LinkText
   -- Partial LinkText
   -- Tag Name
   -- CssSelector
   -- XPath
2. XPath and CSSSelector are universal and can be used on any HTML element.
2. ***When a class name has 2 values, either one can be used when finding the element using class name.***

##### CSS SELECTOR
1. if the HTML element has a className, syntax for cssSelector is ***tagname.classname***
2. if the HTML element has an id, the syntax for cssSelector is ***tagname#is***
3. When **id** or **className** are NOT available, cssSelector has a generic syntax `classname[attribute = value}`








# GIT TUTORIAL:
1. The Eclipse workspace and the local git repository on your computer should be the same for code to be moved to github. DO NOT CREATE A SEPARATE ECLIPSE WORKSPACE.
2. When cloning a repo or committing code, the GIT credentials required are the user(gpappu) and the Github password. DO NOT USE THE GITHUB USERNAME


