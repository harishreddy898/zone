set projectLocation=C:\eclip-tst workspace\Frames
cd %projectLocation%
set classpath=C:\eclip-tst workspace\Frames\bin;C:\eclip-tst workspace\Frames\lib\*
java org.testng.TestNG testng.xml
pause