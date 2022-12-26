-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 25 Des 2022 pada 16.52
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pengarsipan_skripsi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_dosen`
--

CREATE TABLE `t_data_dosen` (
  `id` int(2) NOT NULL,
  `nid` varchar(10) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `t_data_dosen`
--

INSERT INTO `t_data_dosen` (`id`, `nid`, `nama`, `email`) VALUES
(3, '0421057601', 'Steven Sentinuwo', 'sentinuwo21@gmail.com'),
(4, '0421057602', 'Yaulie Rindengan', 'yaulie89@gmail.com'),
(5, '0421057603', 'Alicia Sinsuw', 'alicia73@gmail.com'),
(6, '0421057604', 'Agustinus Jacobus', 'agustinus85@gmail.com'),
(7, '0421057605', 'Brave Sugiarso', 'sugiarso75@gmail.com'),
(8, '0421057606', 'Virginia Tulenan', 'virginia24@gmailcom'),
(9, '0421057607', 'Oktavian Lanang', 'oktavian25@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_mahasiswa`
--

CREATE TABLE `t_data_mahasiswa` (
  `id` int(2) NOT NULL,
  `nim` varchar(10) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `jurusan` varchar(30) DEFAULT NULL,
  `angkatan` varchar(4) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `t_data_mahasiswa`
--

INSERT INTO `t_data_mahasiswa` (`id`, `nim`, `nama`, `jurusan`, `angkatan`, `email`) VALUES
(3, '110216085', 'Mario Robert Walingkas', 'Teknik Informatika', '2019', 'mario24@gmail.com'),
(4, '100216061', 'Julio Stefanus Nari', 'Teknik Informatika', '2019', 'julio23@gmail.com'),
(5, '100216060', 'Michello Pratama', 'Teknik Informatika', '2019', 'michello68@gmail.com'),
(6, '120216108', 'Cristh Valentino', 'Teknik Informatika', '2019', 'cristh11@gmail.com'),
(7, '120216096', 'Rendy Frits Raranta', 'Teknik Informatika', '2019', 'rendy47@gmail.com'),
(8, '100216023', 'Vanda Wirayanthi Marellu', 'Teknik Informatika', '2019', 'vanda25@gmail.com'),
(9, '100216043', 'Alan Stevenres Bentelu', 'Teknik Informatika', '2019', 'alan27@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_skripsi`
--

CREATE TABLE `t_data_skripsi` (
  `id` int(2) NOT NULL,
  `kode_skripsi` varchar(11) DEFAULT NULL,
  `judul` varchar(100) DEFAULT NULL,
  `nim` varchar(10) DEFAULT NULL,
  `nid` varchar(10) DEFAULT NULL,
  `tahun` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `t_data_skripsi`
--

INSERT INTO `t_data_skripsi` (`id`, `kode_skripsi`, `judul`, `nim`, `nid`, `tahun`) VALUES
(3, 'ANDROID001', 'Aplikasi', '110216085', '0421057601', '2019'),
(4, 'GAME001', 'Perancangan Studio Musik Bambu dengan Perspektif Animasi 3D', '100216061', '0421057602', '2019'),
(5, 'GAME002', 'Prototipe Game Musik Bambu Menggunakan Engine Unity 3D', '100216060', '0421057603', '2019'),
(6, 'WEB001', 'Sistem Informasi Pariwisata Berbasis Web di Pulau Lembeh', '120216108', '0421057604', '2019'),
(7, 'AR001', 'Pengenalan Teks pada Objek-Objek Wisata di Sulawesi Utara dengan Teknologi Augmented Reality', '120216096', '0421057605', '2021'),
(8, 'WEB002', 'Augmented Reality untuk Memodelkan Hotel Aston Manado', '100216023', '0421057606', '2019'),
(10, 'ANIMASI001', 'Animasi 3 Dimensi Pencegahan Cyber Crime (Studi Kasus : Kota Manado)', '100216043', '0421057607', '2018');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_kategori_skripsi`
--

CREATE TABLE `t_kategori_skripsi` (
  `id` int(2) NOT NULL,
  `kode_skripsi` varchar(11) DEFAULT NULL,
  `kategori_skripsi` varchar(20) DEFAULT NULL,
  `kategori_studi` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `t_kategori_skripsi`
--

INSERT INTO `t_kategori_skripsi` (`id`, `kode_skripsi`, `kategori_skripsi`, `kategori_studi`) VALUES
(3, 'ANDROID001', 'ANDROID', 'DSE'),
(4, 'GAME001', 'GAME', 'AIG'),
(5, 'GAME002', 'GAME', 'AIG'),
(6, 'WEB001', 'WEB', 'DSE'),
(7, 'AR001', 'AUGMENTED REALITY', 'AIG'),
(8, 'WEB002', 'WEB', 'AIG'),
(9, 'ANIMASI001', 'ANIMASI', 'AIG');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_petugas_tu`
--

CREATE TABLE `t_petugas_tu` (
  `id` int(2) NOT NULL,
  `nama_petugas` varchar(30) DEFAULT NULL,
  `nama_pengguna` varchar(15) DEFAULT NULL,
  `kata_sandi` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `t_petugas_tu`
--

INSERT INTO `t_petugas_tu` (`id`, `nama_petugas`, `nama_pengguna`, `kata_sandi`) VALUES
(4, 'Alfin', 'alfin74', 'admin'),
(5, 'Adhani', 'hani34', 'admin'),
(6, 'Syifa', 'syifa46', 'admin'),
(7, 'Adisti', 'adis27', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `t_data_dosen`
--
ALTER TABLE `t_data_dosen`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_data_mahasiswa`
--
ALTER TABLE `t_data_mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_data_skripsi`
--
ALTER TABLE `t_data_skripsi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_kategori_skripsi`
--
ALTER TABLE `t_kategori_skripsi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_petugas_tu`
--
ALTER TABLE `t_petugas_tu`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `t_data_dosen`
--
ALTER TABLE `t_data_dosen`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `t_data_mahasiswa`
--
ALTER TABLE `t_data_mahasiswa`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `t_data_skripsi`
--
ALTER TABLE `t_data_skripsi`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `t_kategori_skripsi`
--
ALTER TABLE `t_kategori_skripsi`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `t_petugas_tu`
--
ALTER TABLE `t_petugas_tu`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
