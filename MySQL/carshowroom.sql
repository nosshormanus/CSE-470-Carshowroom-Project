-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2022 at 08:27 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `carshowroom`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
--

INSERT INTO `admin` (`email`, `password`) VALUES
('admin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `id` varchar(100) NOT NULL,
  `product` varchar(100) NOT NULL,
  `manufacturer` varchar(100) NOT NULL,
  `model` varchar(100) NOT NULL,
  `features` varchar(200) NOT NULL,
  `price` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`id`, `product`, `manufacturer`, `model`, `features`, `price`) VALUES
('1', 'BMW CAR', 'BMW Group', 'BMW 6 Series GT', '48V mid hybrid tech', 48684),
('2', 'BUGATTI', 'Bugatti Automobiles S.A.S.', 'Chiron Super Sport 300+', '8.0L Quad-Turbo W16 Gas,7-Speed DSG', 3900000),
('3', 'Ferrari', 'Ferrari N.V', 'Ferrari 250 GTO', 'Sports car,300 PS,7500 rpm', 48000000);

-- --------------------------------------------------------

--
-- Table structure for table `checkcar`
--

CREATE TABLE `checkcar` (
  `carmodel` varchar(100) NOT NULL,
  `yop` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `checkcar`
--

INSERT INTO `checkcar` (`carmodel`, `yop`, `description`) VALUES
('asdasdasd', 'asdasdasd', 'asdasdadasd');

-- --------------------------------------------------------

--
-- Table structure for table `repaircar`
--

CREATE TABLE `repaircar` (
  `carmodel` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `repaircar`
--

INSERT INTO `repaircar` (`carmodel`, `description`) VALUES
('saadsassasa', 'asdasdasdsad sadasd'),
('showmen', 'showmen');

-- --------------------------------------------------------

--
-- Table structure for table `reqcar`
--

CREATE TABLE `reqcar` (
  `carmodel` varchar(100) NOT NULL,
  `manufacturer` varchar(100) NOT NULL,
  `features` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reqcar`
--

INSERT INTO `reqcar` (`carmodel`, `manufacturer`, `features`, `price`) VALUES
('ab', 'ab', 'ab', 'ab'),
('ads', 'asd', 'asd', 'asd'),
('Audi A6', '4500$', 'Audi Group', 'turbo engine'),
('abcdef', 'abcdef', 'abcdef', 'abcdef');

-- --------------------------------------------------------

--
-- Table structure for table `sellcar`
--

CREATE TABLE `sellcar` (
  `carmodel` varchar(100) NOT NULL,
  `yop` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sellcar`
--

INSERT INTO `sellcar` (`carmodel`, `yop`, `description`, `price`) VALUES
('adasd', 'asdasd', 'asdasd', '0'),
('asda', 'asdasd', 'adasd', '0'),
('abcd', 'abcdef', 'abcdef', '0'),
('showmen', 'showmen', 'showmen', '0');

-- --------------------------------------------------------

--
-- Table structure for table `suff`
--

CREATE TABLE `suff` (
  `name` varchar(100) NOT NULL,
  `designation` varchar(100) NOT NULL,
  `dutytime` varchar(100) NOT NULL,
  `workinghour` int(100) NOT NULL,
  `salary` varchar(100) NOT NULL,
  `Id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suff`
--

INSERT INTO `suff` (`name`, `designation`, `dutytime`, `workinghour`, `salary`, `Id`) VALUES
('A', 'delivary man', '9AM-6PM', 36, '0', '1'),
('B', 'Salesman', '9AM-6PM', 25, '0', '2'),
('C', 'manager', '8AM-10PM', 50, '0', '3'),
('D', 'Mechanic', '2PM-10PM', 40, '0', '4'),
('E', 'Testdriver', '4PM-8PM', 15, '0', '5');

-- --------------------------------------------------------

--
-- Table structure for table `user1`
--

CREATE TABLE `user1` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user1`
--

INSERT INTO `user1` (`name`, `email`, `address`, `password`) VALUES
('showmen', 'showmen', 'showmen', '123');

-- --------------------------------------------------------

--
-- Table structure for table `useracc`
--

CREATE TABLE `useracc` (
  `acctype` varchar(20) NOT NULL,
  `accno` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `useracc`
--

INSERT INTO `useracc` (`acctype`, `accno`) VALUES
('Bkash', '121212'),
('Bkash', '4444');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `suff`
--
ALTER TABLE `suff`
  ADD UNIQUE KEY `Id` (`Id`);

--
-- Indexes for table `user1`
--
ALTER TABLE `user1`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `useracc`
--
ALTER TABLE `useracc`
  ADD PRIMARY KEY (`accno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

/*new update