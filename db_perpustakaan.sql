-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 01 Des 2022 pada 15.03
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
-- Database: `db_perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_anggota`
--

CREATE TABLE `t_data_anggota` (
  `id` int(11) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `no_hp` varchar(13) DEFAULT NULL,
  `domisili` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_buku`
--

CREATE TABLE `t_data_buku` (
  `id` int(11) NOT NULL,
  `judul` varchar(30) DEFAULT NULL,
  `pengarang` varchar(30) DEFAULT NULL,
  `penerbit` varchar(30) DEFAULT NULL,
  `kategori` varchar(30) DEFAULT NULL,
  `deskripsi` text DEFAULT NULL,
  `stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_peminjaman_buku`
--

CREATE TABLE `t_peminjaman_buku` (
  `id` int(11) NOT NULL,
  `id_anggota` int(11) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `id_buku` int(11) DEFAULT NULL,
  `judul` varchar(30) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `tgl_pinjam` varchar(30) DEFAULT NULL,
  `tgl_kembali` varchar(30) DEFAULT NULL,
  `denda` int(11) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_pustakawan`
--

CREATE TABLE `t_pustakawan` (
  `id` int(11) NOT NULL,
  `nama_pustakawan` varchar(30) DEFAULT NULL,
  `nama_pengguna` varchar(30) DEFAULT NULL,
  `kata_sandi` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `t_data_anggota`
--
ALTER TABLE `t_data_anggota`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_data_buku`
--
ALTER TABLE `t_data_buku`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_peminjaman_buku`
--
ALTER TABLE `t_peminjaman_buku`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `t_pustakawan`
--
ALTER TABLE `t_pustakawan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `t_data_anggota`
--
ALTER TABLE `t_data_anggota`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `t_data_buku`
--
ALTER TABLE `t_data_buku`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `t_peminjaman_buku`
--
ALTER TABLE `t_peminjaman_buku`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `t_pustakawan`
--
ALTER TABLE `t_pustakawan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
