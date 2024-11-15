-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2024 at 04:12 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `01_dbppob`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(6) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nama_admin` varchar(20) DEFAULT NULL,
  `id_level` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`, `nama_admin`, `id_level`) VALUES
(1, 'admindemo', 'admindemo', 'Admin Demo', 1),
(2, 'bankdemo', 'bankdemo', 'Bank Demo', 2);

-- --------------------------------------------------------

--
-- Table structure for table `level`
--

CREATE TABLE `level` (
  `id_level` int(6) NOT NULL,
  `nama_level` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `level`
--

INSERT INTO `level` (`id_level`, `nama_level`) VALUES
(1, 'Admin'),
(2, 'Bank');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` int(6) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nomor_kwh` varchar(10) DEFAULT NULL,
  `nama_pelanggan` varchar(20) DEFAULT NULL,
  `alamat` varchar(30) DEFAULT NULL,
  `id_tarif` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `username`, `password`, `nomor_kwh`, `nama_pelanggan`, `alamat`, `id_tarif`) VALUES
(1, 'userdemo', 'userdemo', '1234567890', 'User Demo', 'Jl. Demo', 1),
(2, 'usertest', 'usertest', '0987654321', 'User Test', 'Jl. Test', 2),
(3, 'userbaru', 'userbaru', NULL, 'User Baru', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` int(6) NOT NULL,
  `id_tagihan` int(6) DEFAULT NULL,
  `id_pelanggan` int(6) DEFAULT NULL,
  `tanggal_pembayaran` date DEFAULT NULL,
  `bulan_bayar` varchar(10) DEFAULT NULL,
  `biaya_admin` int(15) DEFAULT NULL,
  `total_bayar` int(15) DEFAULT NULL,
  `id_admin` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id_pembayaran`, `id_tagihan`, `id_pelanggan`, `tanggal_pembayaran`, `bulan_bayar`, `biaya_admin`, `total_bayar`, `id_admin`) VALUES
(1, 1, 1, '2019-02-06', 'Januari', 2500, 278500, 1),
(2, 2, 2, '2019-02-13', 'Januari', 2500, 277500, 2),
(3, 3, 1, '2019-03-19', 'Februari', 2500, 122500, 1),
(4, 4, 2, '2019-03-14', 'Februari', 2500, 277500, 1),
(5, 5, 1, '2019-04-10', 'Maret', 2500, 122500, 1),
(6, 6, 2, '2019-04-13', 'Maret', 2500, 277500, 1),
(7, 8, 2, '2019-09-27', 'September', 2500, 252500, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `penggunaan`
--

CREATE TABLE `penggunaan` (
  `id_penggunaan` int(6) NOT NULL,
  `id_pelanggan` int(6) DEFAULT NULL,
  `bulan` varchar(10) DEFAULT NULL,
  `tahun` year(4) DEFAULT NULL,
  `meter_awal` int(20) DEFAULT NULL,
  `meter_akhir` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `penggunaan`
--

INSERT INTO `penggunaan` (`id_penggunaan`, `id_pelanggan`, `bulan`, `tahun`, `meter_awal`, `meter_akhir`) VALUES
(1, 1, 'Januari', '2019', 0, 230),
(2, 2, 'Januari', '2019', 0, 110),
(3, 1, 'Februari', '2019', 230, 330),
(4, 2, 'Februari', '2019', 110, 220),
(5, 1, 'Maret', '2019', 330, 430),
(6, 2, 'Maret', '2019', 220, 330),
(7, 1, 'Oktober', '2019', 1000, 1100),
(8, 2, 'Oktober', '2019', 1200, 1300);

-- --------------------------------------------------------

--
-- Table structure for table `tagihan`
--

CREATE TABLE `tagihan` (
  `id_tagihan` int(6) NOT NULL,
  `id_penggunaan` int(6) DEFAULT NULL,
  `id_pelanggan` int(6) DEFAULT NULL,
  `bulan` varchar(10) DEFAULT NULL,
  `tahun` year(4) DEFAULT NULL,
  `jumlah_meter` int(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tagihan`
--

INSERT INTO `tagihan` (`id_tagihan`, `id_penggunaan`, `id_pelanggan`, `bulan`, `tahun`, `jumlah_meter`, `status`) VALUES
(1, 1, 1, 'Januari', '2019', 230, 'Sudah Bayar'),
(2, 2, 2, 'Januari', '2019', 110, 'Sudah Bayar'),
(3, 3, 1, 'Februari', '2019', 100, 'Sudah Bayar'),
(4, 4, 2, 'Februari', '2019', 110, 'Sudah Bayar'),
(5, 5, 1, 'Maret', '2019', 100, 'Sudah Bayar'),
(6, 6, 2, 'Maret', '2019', 110, 'Sudah Bayar'),
(7, 7, 1, 'Oktober', '2019', 100, 'Belum Bayar'),
(8, 8, 2, 'Oktober', '2019', 100, 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `tarif`
--

CREATE TABLE `tarif` (
  `id_tarif` int(6) NOT NULL,
  `daya` varchar(10) DEFAULT NULL,
  `tarifperkwh` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tarif`
--

INSERT INTO `tarif` (`id_tarif`, `daya`, `tarifperkwh`) VALUES
(1, 'R1M/600V', 1200),
(2, 'R2M/1200V', 2500),
(3, 'R3M/3000V', 5000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`),
  ADD KEY `admin_id_level_fk` (`id_level`);

--
-- Indexes for table `level`
--
ALTER TABLE `level`
  ADD PRIMARY KEY (`id_level`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`),
  ADD KEY `pelanggan_id_tarif_fk` (`id_tarif`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`),
  ADD KEY `pembayaran_id_admin_fk` (`id_admin`),
  ADD KEY `pembayaran_id_tagihan_fk` (`id_tagihan`);

--
-- Indexes for table `penggunaan`
--
ALTER TABLE `penggunaan`
  ADD PRIMARY KEY (`id_penggunaan`),
  ADD KEY `penggunaan_id_pelanggan_fk` (`id_pelanggan`);

--
-- Indexes for table `tagihan`
--
ALTER TABLE `tagihan`
  ADD PRIMARY KEY (`id_tagihan`),
  ADD KEY `tagihan_id_penggunaan_fk` (`id_penggunaan`),
  ADD KEY `tagihan_id_pelanggan_fk` (`id_pelanggan`);

--
-- Indexes for table `tarif`
--
ALTER TABLE `tarif`
  ADD PRIMARY KEY (`id_tarif`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `level`
--
ALTER TABLE `level`
  MODIFY `id_level` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id_pelanggan` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id_pembayaran` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `penggunaan`
--
ALTER TABLE `penggunaan`
  MODIFY `id_penggunaan` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tagihan`
--
ALTER TABLE `tagihan`
  MODIFY `id_tagihan` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tarif`
--
ALTER TABLE `tarif`
  MODIFY `id_tarif` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `admin_id_level_fk` FOREIGN KEY (`id_level`) REFERENCES `level` (`id_level`);

--
-- Constraints for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD CONSTRAINT `pelanggan_id_tarif_fk` FOREIGN KEY (`id_tarif`) REFERENCES `tarif` (`id_tarif`);

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `pembayaran_id_admin_fk` FOREIGN KEY (`id_admin`) REFERENCES `admin` (`id_admin`),
  ADD CONSTRAINT `pembayaran_id_tagihan_fk` FOREIGN KEY (`id_tagihan`) REFERENCES `tagihan` (`id_tagihan`);

--
-- Constraints for table `penggunaan`
--
ALTER TABLE `penggunaan`
  ADD CONSTRAINT `penggunaan_id_pelanggan_fk` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`);

--
-- Constraints for table `tagihan`
--
ALTER TABLE `tagihan`
  ADD CONSTRAINT `tagihan_id_pelanggan_fk` FOREIGN KEY (`id_pelanggan`) REFERENCES `penggunaan` (`id_pelanggan`),
  ADD CONSTRAINT `tagihan_id_penggunaan_fk` FOREIGN KEY (`id_penggunaan`) REFERENCES `penggunaan` (`id_penggunaan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
