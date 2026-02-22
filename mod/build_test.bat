@echo off
chcp 65001 >nul
echo Building UnibinsBot mod...
echo.

REM Check Java version
java -version
echo.

REM Run Gradle build
call gradlew.bat build

if %ERRORLEVEL% EQU 0 (
    echo.
    echo [OK] Build successful!
    echo Mod file: build\libs\unibinsbot-1.0.0.jar
) else (
    echo.
    echo [ERROR] Build failed!
    echo Please check error messages.
)

pause