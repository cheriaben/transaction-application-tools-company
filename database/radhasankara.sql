-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2015 at 05:22 PM
-- Server version: 5.6.11
-- PHP Version: 5.5.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `radhasankara`
--
CREATE DATABASE IF NOT EXISTS `radhasankara` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `radhasankara`;

-- --------------------------------------------------------

--
-- Table structure for table `tblcustomers`
--

CREATE TABLE IF NOT EXISTS `tblcustomers` (
  `ID_customer` varchar(8) NOT NULL,
  `nama_customer` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `kelurahan` varchar(20) NOT NULL,
  `kecamatan` varchar(20) NOT NULL,
  `kota` varchar(20) NOT NULL,
  `kodepos` int(5) NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `status_customer` varchar(8) NOT NULL,
  PRIMARY KEY (`ID_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblcustomers`
--

INSERT INTO `tblcustomers` (`ID_customer`, `nama_customer`, `alamat`, `kelurahan`, `kecamatan`, `kota`, `kodepos`, `no_telepon`, `email`, `status_customer`) VALUES
('CUS-0001', 'Kezia Septaviana', 'Jl. Ampasit', 'Tomang', 'Tomang', 'Jakarta Pusat', 10120, '+628990255578', '535120066@fti.untar.ac.id', 'User'),
('CUS-0002', 'PT. Karwell Indonesia Tbk', 'Jl. Gunung Sahari', 'Gunung Sahari', 'Senen', 'Jakarta Pusat', 10120, '+62214200908', 'sales@karwell.co.id', 'Reseller'),
('CUS-0003', 'PT. Katexindo Citramandiri', 'Jl. KBN Raya', 'Cakung', 'Cakung', 'Jakarta Utara', 14250, '+62214401928', 'tal@katex.com', 'Reseller'),
('CUS-0004', 'Norman', 'Tomang', 'Tomang', 'Tomang', 'Jakarta', 10120, '+628990255578', '535120039@fti.untar.ac.id', 'User'),
('CUS-0005', 'Foris Julio', 'Jl. Wesel no. 10B', 'Kelapa Gading Timur', 'Kelapa Gading', 'Jakarta Utara', 14250, '+628121111250', 'forisjulio@yahoo.com', 'User');

-- --------------------------------------------------------

--
-- Table structure for table `tblinventory`
--

CREATE TABLE IF NOT EXISTS `tblinventory` (
  `ID_barang` varchar(8) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `ID_tipe` varchar(8) NOT NULL,
  `ID_satuan` varchar(8) NOT NULL,
  `stock` int(4) NOT NULL,
  `status_barang` varchar(12) NOT NULL,
  PRIMARY KEY (`ID_barang`),
  KEY `ID_tipe` (`ID_tipe`),
  KEY `ID_satuan` (`ID_satuan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblinventory`
--

INSERT INTO `tblinventory` (`ID_barang`, `nama_barang`, `ID_tipe`, `ID_satuan`, `stock`, `status_barang`) VALUES
('BAR-0001', 'Tungsten Carbide Burs Cylinder Single A30211', 'TIP-0001', 'SAT-0001', 10, 'Available'),
('BAR-0002', 'Tungsten Carbide Burs Cylinder Double A30211', 'TIP-0002', 'SAT-0001', 30, 'Available'),
('BAR-0003', 'Tungsten Carbide Burs Cylinder Single A30314', 'TIP-0003', 'SAT-0001', 10, 'Available'),
('BAR-0004', 'Tungsten Carbide Burs Cylinder Double A30314', 'TIP-0004', 'SAT-0001', 22, 'Available'),
('BAR-0005', 'Tungsten Carbide Burs Cylinder Single A30605', 'TIP-0005', 'SAT-0001', 10, 'Available'),
('BAR-0006', 'Tungsten Carbide Burs Cylinder Double A30605', 'TIP-0006', 'SAT-0001', 10, 'Available'),
('BAR-0007', 'Tungsten Carbide Burs Cylinder Single A30612', 'TIP-0007', 'SAT-0001', 10, 'Available'),
('BAR-0008', 'Tungsten Carbide Burs Cylinder Double A30612', 'TIP-0008', 'SAT-0001', 10, 'Available'),
('BAR-0009', 'Tungsten Carbide Burs Cylinder Single A60618', 'TIP-0009', 'SAT-0001', 10, 'Available'),
('BAR-0010', 'Tungsten Carbide Burs Cylinder Double A60618', 'TIP-0010', 'SAT-0001', 10, 'Available'),
('BAR-0011', 'Tungsten Carbide Burs Cylinder Single A60820', 'TIP-0011', 'SAT-0001', 10, 'Available'),
('BAR-0012', 'Tungsten Carbide Burs Cylinder Double A60820', 'TIP-0012', 'SAT-0001', 10, 'Available'),
('BAR-0013', 'Tungsten Carbide Burs Cylinder Single A61020', 'TIP-0013', 'SAT-0001', 10, 'Available'),
('BAR-0014', 'Tungsten Carbide Burs Cylinder Double A61020', 'TIP-0014', 'SAT-0001', 10, 'Available'),
('BAR-0015', 'Tungsten Carbide Burs Cylinder Single A61125', 'TIP-0015', 'SAT-0001', 10, 'Available'),
('BAR-0016', 'Tungsten Carbide Burs Cylinder Double A61125', 'TIP-0016', 'SAT-0001', 25, 'Available'),
('BAR-0017', 'Tungsten Carbide Burs Cylinder Single A61220', 'TIP-0017', 'SAT-0001', 10, 'Available'),
('BAR-0018', 'Tungsten Carbide Burs Cylinder Double A61220', 'TIP-0018', 'SAT-0001', 10, 'Available'),
('BAR-0019', 'Tungsten Carbide Burs Cylinder Single A61225', 'TIP-0019', 'SAT-0001', 10, 'Available'),
('BAR-0020', 'Tungsten Carbide Burs Cylinder Double A61225', 'TIP-0020', 'SAT-0001', 20, 'Available'),
('BAR-0021', 'Tungsten Carbide Burs Cylinder Single A61525', 'TIP-0021', 'SAT-0001', 10, 'Available'),
('BAR-0022', 'Tungsten Carbide Burs Cylinder Double A61525', 'TIP-0022', 'SAT-0001', 15, 'Available'),
('BAR-0023', 'Tungsten Carbide Burs Cylinder Single A62025', 'TIP-0023', 'SAT-0001', 5, 'Available'),
('BAR-0024', 'Tungsten Carbide Burs Cylinder Double A62025', 'TIP-0024', 'SAT-0001', 10, 'Available'),
('BAR-0025', 'Tungsten Carbide Burs Cylinder SIngle A62525', 'TIP-0025', 'SAT-0001', 5, 'Available'),
('BAR-0026', 'Tungsten Carbide Burs Cylinder Double A62525', 'TIP-0026', 'SAT-0001', 10, 'Available'),
('BAR-0027', 'Tungsten Carbide Burs Cylinder End Cut Single A30211E', 'TIP-0027', 'SAT-0001', 10, 'Available'),
('BAR-0028', 'Tungsten Carbide Burs Cylinder End Cut Double A30211E', 'TIP-0028', 'SAT-0001', 25, 'Available'),
('BAR-0029', 'Tungsten Carbide Burs Cylinder End Cut Single A30314E', 'TIP-0029', 'SAT-0001', 10, 'Available'),
('BAR-0030', 'Tungsten Carbide Burs Cylinder End Cut Double A30314E', 'TIP-0030', 'SAT-0001', 50, 'Available'),
('BAR-0031', 'Tungsten Carbide Burs Cylinder End Cut Single A30605E', 'TIP-0031', 'SAT-0001', 5, 'Available'),
('BAR-0032', 'Tungsten Carbide Burs Cylinder End Cut Double A30605E', 'TIP-0032', 'SAT-0001', 40, 'Available'),
('BAR-0033', 'Tungsten Carbide Burs Bull Nose Single C30211', 'TIP-0033', 'SAT-0001', 10, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `tbljenis`
--

CREATE TABLE IF NOT EXISTS `tbljenis` (
  `ID_jenis` varchar(8) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_jenis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbljenis`
--

INSERT INTO `tbljenis` (`ID_jenis`, `jenis`) VALUES
('JEN-0001', 'mata bor'),
('JEN-0002', 'palu'),
('JEN-0003', 'gergaji'),
('JEN-0004', 'obeng'),
('JEN-0005', 'tang potong');

-- --------------------------------------------------------

--
-- Table structure for table `tbllogin`
--

CREATE TABLE IF NOT EXISTS `tbllogin` (
  `ID_account` varchar(8) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `tipe_acc` varchar(12) NOT NULL,
  `email` varchar(30) NOT NULL,
  `recovery` varchar(50) NOT NULL,
  `answer` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_account`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbllogin`
--

INSERT INTO `tbllogin` (`ID_account`, `username`, `password`, `tipe_acc`, `email`, `recovery`, `answer`) VALUES
('ACC-0001', 'jnazary', 'jnazary', 'Pimpinan', '535100000@fti.untar.ac.id', 'Siapa nama keponakan anda?', 'Norman'),
('ACC-0002', 'admin@rs', '12345', 'Administrasi', '535120039@fti.untar.ac.id', 'Makanan kesukaan?', 'Bakso bulet'),
('ACC-0003', 'admin2@rs', 'admin', 'Administrasi', '535120012@fti.untar.ac.id', 'Nama masa kecil?', 'cepot'),
('ACC-0004', 'admin3@rs', '98765', 'Administrasi', 'admin3@radhasankara.com', 'Di kota mana anda lahir?', 'Bangka');

-- --------------------------------------------------------

--
-- Table structure for table `tblmerek`
--

CREATE TABLE IF NOT EXISTS `tblmerek` (
  `ID_merek` varchar(8) NOT NULL,
  `merek` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_merek`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblmerek`
--

INSERT INTO `tblmerek` (`ID_merek`, `merek`) VALUES
('MER-0001', 'Procut'),
('MER-0002', 'Gedore'),
('MER-0003', 'Matador'),
('MER-0004', 'Kenmaster');

-- --------------------------------------------------------

--
-- Table structure for table `tblpembelian`
--

CREATE TABLE IF NOT EXISTS `tblpembelian` (
  `ID_pembelian` varchar(8) NOT NULL,
  `ID_barang` varchar(8) NOT NULL,
  `jumlah_beli` int(4) NOT NULL,
  `harga_beli` double NOT NULL,
  `tanggal_beli` date NOT NULL,
  PRIMARY KEY (`ID_pembelian`),
  KEY `ID_barang` (`ID_barang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblpembelian`
--

INSERT INTO `tblpembelian` (`ID_pembelian`, `ID_barang`, `jumlah_beli`, `harga_beli`, `tanggal_beli`) VALUES
('BEL-0001', 'BAR-0001', 10, 55000, '2015-04-30'),
('BEL-0002', 'BAR-0002', 30, 55000, '2015-04-30'),
('BEL-0003', 'BAR-0003', 10, 55000, '2015-04-30'),
('BEL-0004', 'BAR-0004', 22, 55000, '2015-05-01'),
('BEL-0005', 'BAR-0005', 10, 90000, '2015-05-24'),
('BEL-0006', 'BAR-0006', 10, 90000, '2015-05-24'),
('BEL-0007', 'BAR-0007', 10, 90000, '2015-05-24'),
('BEL-0008', 'BAR-0008', 10, 90000, '2015-05-24'),
('BEL-0009', 'BAR-0009', 10, 94000, '2015-05-24'),
('BEL-0010', 'BAR-0010', 10, 94000, '2015-05-24'),
('BEL-0011', 'BAR-0011', 10, 122000, '2015-05-24'),
('BEL-0012', 'BAR-0012', 10, 122000, '2015-05-24'),
('BEL-0013', 'BAR-0013', 10, 132000, '2015-05-24'),
('BEL-0014', 'BAR-0014', 10, 132000, '2015-05-24'),
('BEL-0015', 'BAR-0015', 10, 190000, '2015-05-24'),
('BEL-0016', 'BAR-0016', 25, 190000, '2015-05-24'),
('BEL-0017', 'BAR-0017', 10, 200000, '2015-05-24'),
('BEL-0018', 'BAR-0018', 10, 200000, '2015-05-24'),
('BEL-0019', 'BAR-0019', 10, 205000, '2015-05-24'),
('BEL-0020', 'BAR-0020', 20, 205000, '2015-05-24'),
('BEL-0021', 'BAR-0021', 10, 259000, '2015-05-24'),
('BEL-0022', 'BAR-0022', 15, 259000, '2015-05-24'),
('BEL-0023', 'BAR-0023', 5, 384000, '2015-05-24'),
('BEL-0024', 'BAR-0024', 10, 384000, '2015-05-24'),
('BEL-0025', 'BAR-0025', 5, 536000, '2015-05-24'),
('BEL-0026', 'BAR-0026', 10, 536000, '2015-05-24'),
('BEL-0027', 'BAR-0027', 10, 61000, '2015-05-24'),
('BEL-0028', 'BAR-0028', 25, 61000, '2015-05-24'),
('BEL-0029', 'BAR-0029', 10, 61000, '2015-05-24'),
('BEL-0030', 'BAR-0030', 50, 61000, '2015-05-24'),
('BEL-0031', 'BAR-0031', 5, 99000, '2015-05-24'),
('BEL-0032', 'BAR-0032', 40, 99000, '2015-05-24'),
('BEL-0033', 'BAR-0033', 10, 55000, '2015-05-24');

-- --------------------------------------------------------

--
-- Table structure for table `tblpenjualan`
--

CREATE TABLE IF NOT EXISTS `tblpenjualan` (
  `ID_penjualan` varchar(8) NOT NULL,
  `invoice` varchar(5) NOT NULL,
  `ID_customer` varchar(8) NOT NULL,
  `ID_barang` varchar(8) NOT NULL,
  `jumlah_jual` int(4) NOT NULL,
  `harga_jual` double NOT NULL,
  `cara_pembayaran` varchar(8) DEFAULT NULL,
  `no_transaksi` varchar(15) DEFAULT NULL,
  `tanggal_jual` date DEFAULT NULL,
  `status_penjualan` varchar(11) NOT NULL,
  PRIMARY KEY (`ID_penjualan`),
  KEY `ID_customer` (`ID_customer`),
  KEY `ID_barang` (`ID_barang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblpreorder`
--

CREATE TABLE IF NOT EXISTS `tblpreorder` (
  `ID_PO` varchar(8) NOT NULL,
  `ID_penjualan` varchar(8) NOT NULL,
  `cara_pembayaranPO` varchar(8) NOT NULL,
  `no_transaksiPO` varchar(15) NOT NULL,
  `sisa_pembayaran` double NOT NULL,
  `tanggal_PO` date NOT NULL,
  PRIMARY KEY (`ID_PO`),
  KEY `ID_penjualan` (`ID_penjualan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblsatuan`
--

CREATE TABLE IF NOT EXISTS `tblsatuan` (
  `ID_satuan` varchar(8) NOT NULL,
  `satuan` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_satuan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblsatuan`
--

INSERT INTO `tblsatuan` (`ID_satuan`, `satuan`) VALUES
('SAT-0001', 'pcs'),
('SAT-0002', 'box');

-- --------------------------------------------------------

--
-- Table structure for table `tbltipe`
--

CREATE TABLE IF NOT EXISTS `tbltipe` (
  `ID_tipe` varchar(8) NOT NULL,
  `ID_jenis` varchar(8) NOT NULL,
  `ID_merek` varchar(8) NOT NULL,
  `tipe` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_tipe`),
  KEY `ID_jenis` (`ID_jenis`),
  KEY `ID_merek` (`ID_merek`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbltipe`
--

INSERT INTO `tbltipe` (`ID_tipe`, `ID_jenis`, `ID_merek`, `tipe`) VALUES
('TIP-0001', 'JEN-0001', 'MER-0001', 'A30211-2'),
('TIP-0002', 'JEN-0001', 'MER-0001', 'A30211-6'),
('TIP-0003', 'JEN-0001', 'MER-0001', 'A30314-2'),
('TIP-0004', 'JEN-0001', 'MER-0001', 'A30314-6'),
('TIP-0005', 'JEN-0001', 'MER-0001', 'A30605-2'),
('TIP-0006', 'JEN-0001', 'MER-0001', 'A30605-6'),
('TIP-0007', 'JEN-0001', 'MER-0001', 'A30612-2'),
('TIP-0008', 'JEN-0001', 'MER-0001', 'A30612-6'),
('TIP-0009', 'JEN-0001', 'MER-0001', 'A60618-2'),
('TIP-0010', 'JEN-0001', 'MER-0001', 'A60618-6'),
('TIP-0011', 'JEN-0001', 'MER-0001', 'A60820-2'),
('TIP-0012', 'JEN-0001', 'MER-0001', 'A60820-6'),
('TIP-0013', 'JEN-0001', 'MER-0001', 'A61020-2'),
('TIP-0014', 'JEN-0001', 'MER-0001', 'A61020-6'),
('TIP-0015', 'JEN-0001', 'MER-0001', 'A61125-2'),
('TIP-0016', 'JEN-0001', 'MER-0001', 'A61125-6'),
('TIP-0017', 'JEN-0001', 'MER-0001', 'A61220-2'),
('TIP-0018', 'JEN-0001', 'MER-0001', 'A61220--6'),
('TIP-0019', 'JEN-0001', 'MER-0001', 'A61225-2'),
('TIP-0020', 'JEN-0001', 'MER-0001', 'A61225-6'),
('TIP-0021', 'JEN-0001', 'MER-0001', 'A61525-2'),
('TIP-0022', 'JEN-0001', 'MER-0001', 'A61525-6'),
('TIP-0023', 'JEN-0001', 'MER-0001', 'A62025-2'),
('TIP-0024', 'JEN-0001', 'MER-0001', 'A62025-6'),
('TIP-0025', 'JEN-0001', 'MER-0001', 'A62525-2'),
('TIP-0026', 'JEN-0001', 'MER-0001', 'A62525-6'),
('TIP-0027', 'JEN-0001', 'MER-0001', 'A30211E-2'),
('TIP-0028', 'JEN-0001', 'MER-0001', 'A30211E-6'),
('TIP-0029', 'JEN-0001', 'MER-0001', 'A30314E-2'),
('TIP-0030', 'JEN-0001', 'MER-0001', 'A30314E-6'),
('TIP-0031', 'JEN-0001', 'MER-0001', 'A30605E-2'),
('TIP-0032', 'JEN-0001', 'MER-0001', 'A30605E-6'),
('TIP-0033', 'JEN-0001', 'MER-0001', 'C30211-2'),
('TIP-0034', 'JEN-0001', 'MER-0001', 'C30211-6');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tblinventory`
--
ALTER TABLE `tblinventory`
  ADD CONSTRAINT `invsatuan` FOREIGN KEY (`ID_satuan`) REFERENCES `tblsatuan` (`ID_satuan`),
  ADD CONSTRAINT `invtipe` FOREIGN KEY (`ID_tipe`) REFERENCES `tbltipe` (`ID_tipe`);

--
-- Constraints for table `tblpembelian`
--
ALTER TABLE `tblpembelian`
  ADD CONSTRAINT `belibarang` FOREIGN KEY (`ID_barang`) REFERENCES `tblinventory` (`ID_barang`);

--
-- Constraints for table `tblpenjualan`
--
ALTER TABLE `tblpenjualan`
  ADD CONSTRAINT `jualbarang` FOREIGN KEY (`ID_barang`) REFERENCES `tblinventory` (`ID_barang`),
  ADD CONSTRAINT `jualcust` FOREIGN KEY (`ID_customer`) REFERENCES `tblcustomers` (`ID_customer`);

--
-- Constraints for table `tblpreorder`
--
ALTER TABLE `tblpreorder`
  ADD CONSTRAINT `pojual` FOREIGN KEY (`ID_penjualan`) REFERENCES `tblpenjualan` (`ID_penjualan`);

--
-- Constraints for table `tbltipe`
--
ALTER TABLE `tbltipe`
  ADD CONSTRAINT `jentip` FOREIGN KEY (`ID_jenis`) REFERENCES `tbljenis` (`ID_jenis`),
  ADD CONSTRAINT `mertip` FOREIGN KEY (`ID_merek`) REFERENCES `tblmerek` (`ID_merek`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
