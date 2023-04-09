#include <iostream>
#include <string>
#include <filesystem>

// g++ -std=c++17 -o test_get_path test_get_path.cpp  -lstdc++fs

namespace fs = std::filesystem; // Shortens the amount I need to type below

int main() {

    std::string home_path = fs::path(getenv("HOME"));
    std::cout << home_path << std::endl;

    std::string path = fs::current_path();
    std::cout << path << std::endl;

    bool status;
    status = fs::create_directory(path+"/images");

    // if status is  0 then the directory already exists and it is not empty
    std::cout << status << std::endl;
    
    return 0;
}
