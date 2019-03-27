cmake_minimum_required(VERSION 3.13)
project(base64)

set(CMAKE_CXX_STANDARD 98)

include_directories("C:\\Program Files\\Java\\jdk1.8.0_144\\include" "C:\\Program Files\\Java\\jdk1.8.0_144\\include\\win32")

add_library(base64 SHARED library.cpp library.h base64_impl.h)