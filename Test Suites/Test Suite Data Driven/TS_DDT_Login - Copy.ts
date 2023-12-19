<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_DDT_Login - Copy</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>10</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>9633457d-8f51-4493-abc5-f3849c957e3f</testSuiteGuid>
   <testCaseLink>
      <guid>a783e970-b455-4640-a1ba-3a2743b99869</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/block-Open Section Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>d703b8af-ffca-4ed4-a305-187f5f037bcc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/block-fill login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>40d17cc8-9702-459e-b11e-a4755c86c01b</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/DataKatalon/LoginData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>40d17cc8-9702-459e-b11e-a4755c86c01b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>89d9d473-24fa-4e3d-8454-7a8fac0e2c20</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>40d17cc8-9702-459e-b11e-a4755c86c01b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>453e24de-abb2-4d13-bb6b-4ff4dc3c9307</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
