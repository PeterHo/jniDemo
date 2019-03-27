cmake_minimum_required(VERSION 3.10)
project(base64)

set(CMAKE_CXX_STANDARD 98)

include_directories("./include/" "./include/linux")

add_library(base64 SHARED library.cpp library.h base64_impl.h)