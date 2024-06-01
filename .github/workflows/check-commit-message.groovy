
name: Check Commit Message

on:
  push:
    branches:
      - main
  pull_request:
    branches:
      - main

jobs:
  commit-msg:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - name: Check Commit Message
        env:
          GITHUB_CONTEXT: ${{ toJson(github) }}
        run: ./githooks/check-commits.sh