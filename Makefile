.PHONY: build

default:
	@echo "try make build|test|deploy"

build:
	@./gradlew clean build

test:
	@./gradlew clean test

jar:
	@./gradlew clean jar


