-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 28 Bulan Mei 2024 pada 04.42
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rs`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kamar`
--

CREATE TABLE `kamar` (
  `id` int(11) NOT NULL,
  `nomor_kamar` varchar(10) NOT NULL,
  `jenis_kamar` varchar(50) NOT NULL,
  `fasilitas` text DEFAULT NULL,
  `harga` double NOT NULL,
  `status` enum('tersedia','penuh') NOT NULL,
  `lantai_kamar` int(11) NOT NULL,
  `terisi` int(11) DEFAULT 0,
  `kapasitas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kamar`
--

INSERT INTO `kamar` (`id`, `nomor_kamar`, `jenis_kamar`, `fasilitas`, `harga`, `status`, `lantai_kamar`, `terisi`, `kapasitas`) VALUES
(1, '101', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(2, '102', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 1, 6),
(3, '103', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(4, '104', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 1, 0, 4),
(5, '105', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 1, 0, 4),
(6, '106', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(7, '107', 'Kamar Suite', 'TV, Kamar Mandi Pribadi ', 200000, 'tersedia', 1, 1, 2),
(8, '108', 'Kamar Suite', 'TV, Kamar Mandi Pribadi ', 200000, 'tersedia', 1, 1, 2),
(9, '109', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(10, '110', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 1, 0, 4),
(11, '111', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(12, '112', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(13, '113', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 1, 0, 4),
(14, '114', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 1, 0, 4),
(15, '115', 'Kamar Suite', 'TV, Kamar Mandi Pribadi ', 200000, 'tersedia', 1, 0, 2),
(16, '116', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(17, '117', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(18, '118', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 1, 0, 4),
(19, '119', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(20, '120', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 1, 0, 6),
(21, '121', 'Kamar Suite', 'TV, Kamar Mandi Pribadi, Balkon', 200000, 'tersedia', 2, 0, 2),
(22, '122', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 2, 0, 4),
(23, '123', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 2, 0, 6),
(24, '124', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 2, 0, 4),
(25, '125', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 2, 0, 6),
(26, '126', 'Kamar Suite', 'TV, Kamar Mandi Pribadi, Balkon', 200000, 'tersedia', 2, 0, 2),
(27, '127', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 2, 0, 4),
(28, '128', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 2, 0, 6),
(29, '129', 'Kamar Suite', 'TV, Kamar Mandi Pribadi, Balkon', 200000, 'tersedia', 2, 0, 2),
(30, '130', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 2, 0, 6),
(31, '131', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 2, 0, 4),
(32, '132', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 2, 0, 4),
(33, '133', 'Kamar Suite', 'TV, Kamar Mandi Pribadi, Balkon', 200000, 'tersedia', 2, 0, 2),
(34, '134', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 2, 0, 6),
(35, '135', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 2, 0, 6),
(36, '136', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 2, 0, 6),
(37, '137', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 2, 0, 6),
(38, '138', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 2, 0, 4),
(39, '139', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 2, 0, 4),
(40, '140', 'Kamar Suite', 'TV, Kamar Mandi Pribadi, Balkon', 200000, 'tersedia', 2, 0, 2),
(41, '141', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 3, 0, 6),
(42, '142', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 3, 0, 4),
(43, '143', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 3, 0, 6),
(44, '144', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 3, 0, 6),
(45, '145', 'Kamar Suite', 'TV, Kamar Mandi Pribadi, Balkon', 200000, 'tersedia', 3, 0, 2),
(46, '146', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 3, 0, 6),
(47, '147', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 3, 0, 6),
(48, '148', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 3, 0, 4),
(49, '149', 'Kamar Suite', 'TV, Kamar Mandi Pribadi, Balkon', 200000, 'tersedia', 3, 0, 2),
(50, '150', 'Kamar Tunggal', 'TV, Kamar Mandi Pribadi', 100000, 'tersedia', 3, 0, 6),
(51, '151', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 3, 0, 4),
(52, '152', 'Kamar Double', 'TV, Kamar Mandi Pribadi', 150000, 'tersedia', 3, 0, 4);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` int(11) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `jenis_kelamin` varchar(25) NOT NULL,
  `nomor_telepon` varchar(20) DEFAULT NULL,
  `kamar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `nama`, `alamat`, `jenis_kelamin`, `nomor_telepon`, `kamar`) VALUES
(47, 'sumanto', 'punya', 'lakik', '0877', 107),
(48, 'sumanto kurus', 'punya satu', 'lakik', '087798', 107),
(49, 'tes satu', 'disana', 'lakik', '0877', 108);

-- --------------------------------------------------------

--
-- Struktur dari tabel `staff`
--

CREATE TABLE `staff` (
  `id_staff` int(11) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `sif` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `staff`
--

INSERT INTO `staff` (`id_staff`, `nama`, `alamat`, `sif`) VALUES
(1, 'sum', 'ada satuwer', 'sore'),
(2, 'suma', 'ada satuwer', 'sore'),
(3, 'john', 'jalan dua', 'pagi'),
(4, 'jane', 'jalan tiga', 'siang'),
(5, 'dave', 'jalan empat', 'malam'),
(6, 'lisaa', 'jalan tuju', 'sore'),
(7, 'mike', 'jalan enam', 'pagi'),
(8, 'anna', 'jalan tujuh', 'siang'),
(9, 'bob', 'jalan delapan', 'malam'),
(11, 'tomi rafael', 'jalan sepuluh', 'pagi'),
(12, 'mandra cafe', 'ada', 'sore'),
(13, 'galang', 'dddd', 'pagi'),
(15, 'kucing', 'ddd', 'malam'),
(16, 'kambing', 'ggg', 'malam'),
(17, 'kelinci', 'bantul', 'pagi'),
(18, 'anna palsu', 'jalan tujuh', 'siang'),
(20, 'coba satui', 'ada', 'pagi');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- Indeks untuk tabel `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`id_staff`),
  ADD UNIQUE KEY `id_staff` (`id_staff`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `kamar`
--
ALTER TABLE `kamar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT untuk tabel `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id_pasien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- AUTO_INCREMENT untuk tabel `staff`
--
ALTER TABLE `staff`
  MODIFY `id_staff` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
